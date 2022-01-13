call gradlew.bat clean build

call docker build -t oldjava -f Dockerfile-oldjava .

call docker run --rm --memory=1g oldjava