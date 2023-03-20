docker stop binance_rates
docker rm binance_rates
docker build -t binance_rates .
docker run --cpus="4" -p 81:81 -d --name binance_rates binance_rates
pause