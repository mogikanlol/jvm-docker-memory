1) gradlew.bat clean build dockerTestMemorySuppor -Dcontainer-support=true (false)
2) docker run --rm -e JAVA_OPTS="-Xms50M -Xmx50M" javaOpts

# Test container support

## Unsupported jvm version
```console
gradlew.bat clean build

docker build -t oldjava -f Dockerfile-oldjava .

docker run --rm --memory=1g oldjava
```

## Supported jvm version
```console
gradlew.bat clean build

docker build -t newjava -f Dockerfile-newjava .

docker run --rm --memory=1g newjava
```

# Example of passing memory size into container
```console
gradlew.bat clean build

docker build -t javaopts -f Dockerfile-javaopts .

docker run --rm -e JAVA_OPTS="-Xms50M -Xmx50M" javaopts
```