call gradlew.bat clean build

call docker build -t javaopts -f Dockerfile-javaopts .

call docker run --rm -e JAVA_OPTS="-Xms50M -Xmx50M" javaopts