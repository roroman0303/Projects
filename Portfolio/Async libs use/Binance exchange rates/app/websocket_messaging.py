import asyncio
import websockets
import threading
import logging

logging.basicConfig(level=logging.INFO)

async def consumption_handler(websocket: websockets.WebSocketClientProtocol,
                              handler_function, multithreading=True, log=False) -> None:
    async for message in websocket:
        if log: logging.info(f"Message: {message}")
        if multithreading:
            thread = threading.Thread(target=handler_function, args=(message,))
            thread.start()
        else: handler_function(message)

async def consumption(url: str, handler_function, multithreading=True, log=False) -> None:
    async with websockets.connect(url) as websocket:
        await consumption_handler(websocket, handler_function, multithreading, log)

def start_consumption(url: str, handler_function, multithreading=True, log=False):
    loop = asyncio.get_event_loop()
    loop.run_until_complete(consumption(url, handler_function, multithreading, log))
    loop.run_forever()

