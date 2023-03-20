import asyncio
import logging
import websockets
import threading
import json

logging.basicConfig(level=logging.INFO)

def show(message):
    tickers = json.loads(message)
    for item in tickers:
        if item['s'] == 'BNBBTC': print(item)


async def consumer_handler(websocket: websockets.WebSocketClientProtocol) -> None:
    async for message in websocket:
        # log_message(message)
        thread = threading.Thread(target=show, args=(message,))
        thread.start()

async def consume(url: str) -> None:
    async with websockets.connect(url) as websocket:
        await consumer_handler(websocket)

def log_message(message:str) -> None:
    logging.info(f"Message: {message}")

if __name__ == '__main__':
    url = 'wss://stream.binance.com:9443/ws/!ticker@arr'
    # url = 'wss://stream.binance.com:9443/ws/BNBBTC@ticker'
    loop = asyncio.get_event_loop()
    loop.run_until_complete(consume(url))
    loop.run_forever()