# Redis history

## Search

- Redis는 windows에 설치 지원 안함
- windows용 redis 설치 방법이 있긴 한데, 뭔가 깔끔하지 않은 방법인 듯 하여 cloud 쪽으로 알아봄
  - https://github.com/MicrosoftArchive/redis/releases
  - redis-cli 사용을 위해서는 깔긴 깔아야 함 ㅜㅜ
- 처음에 Google Cloud Platformd의 Google App Engine을 사용하려 했으나
  - 이 도둑놈들이 시간당 사용 요금을 받는데다가 가장 낮은 성능과 용량으로 세팅해도 한 달에 거의 $50에 육박하는 요금을 부과함
- 그래서 무료 redis server를 알아보던 중 redislabs라는 사이트 발견
  - https://redislabs.com/get-started/
- 여기서 Cloud Hosted를 선택하여 redis 세팅, 30MB까지 공짜

## Setup

- 회원 가입 후 Cloud Hosted 설정
- JobroRedis라는 이름의 DB 생성
- 복잡한 URL의 Endpoint가 생성되는데 이걸 사용해서 redis 사용

## Configuration

- Host: redis-12940.c54.ap-northeast-1-2.ec2.cloud.redislabs.com
- Port: 12940

## Connect test

- Install redis-cli
  - https://github.com/MicrosoftArchive/redis/releases
  - 여기서 설치 패키지를 설치 후, redis-cli.exe를 사용
- CLI 환경에서 아래와 같이 입력, 패스워드의 경우는 XXXXXX로 노출 안함

``` Shell
$ redis-cli -h redis-12940.c54.ap-northeast-1-2.ec2.cloud.redislabs.com -p 12940 -a XXXXXX
redis-12940.c54.ap-northeast-1-2.ec2.cloud.redislabs.com:12940> set testid test
OK
redis-12940.c54.ap-northeast-1-2.ec2.cloud.redislabs.com:12940> get testid
"test"
redis-12940.c54.ap-northeast-1-2.ec2.cloud.redislabs.com:12940>
```