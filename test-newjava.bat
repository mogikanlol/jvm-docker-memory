call gradlew.bat clean build

call docker build -t newjava -f Dockerfile-newjava .

call docker run --rm --memory=1g newjava