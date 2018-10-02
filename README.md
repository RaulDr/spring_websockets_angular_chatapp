# spring_websockets_angular_chatapp

```
docker run --name themotherfuckersdb -p 32770:5432 -d postgres

docker container update --restart=always themotherfuckersdb

docker exec -it themotherfuckersdb psql --username postgres -c "CREATE DATABASE themotherfuckers OWNER postgres;"

docker exec -it themotherfuckersdb psql --username postgres -c "GRANT ALL PRIVILEGES ON DATABASE themotherfuckers TO postgres;"
```
