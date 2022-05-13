# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 학습 테스트 실습
* 실습 환경 구축
* String 클래스에 대한 학습 테스트
* Set Collection에 대한 학습 테스트
* assertj 활용
* 코드리뷰 요청 및 피드백

## 2단계 - 문자열 덧셈 계산기
* 문자열 덧셈 계산기를 통한 TDD/리팩토링 실습
* 기능 요구사항
    * 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.\
    (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
    * 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.\
    예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환한다.
    * 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.
* 프로그래밍 요구사항
    * indent(들여쓰기) depth를 2단계에서 1단계로 줄인다.
    * 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
    * else를 사용하지 않는다.
    
## 3단계 - 로또(자동)

### 기능 목록
- [ ] 구입 금액 입력 받는 기능
- [X] 로또 구매하는 기능
- [X] 로또 번호를 생성하는 기능
- [X] 로또 번호를 출력하는 기능
- [X] 구매한 전체 로또 번호를 출력하는 기능
- [ ] 지난주 당첨 번호 입력 받는 기능
- [X] 로또 번호를 비교하는 기능
- [X] 구매한 전체 로또 번호를 비교하는 기능
- [ ] 당첨 통계 출력하는 기능
- [X] 총 당첨금 계산하는 기능
- [ ] 총수익률 출력하는 기능
- [X] 맞춘 숫자 개수에 대한 랭크 구하기

### 리팩토링 작업(클래스)
- [X] 로또 숫자 하나를 표현하는 LottoNo 클래스
- [X] 로또를 표현하는 Lotto 클래스
- [X] 구매한 로또를 표현하는 MyLotto 클래스
- [X] 로또 게임 기능을 표현하는 LottoGame 클래스
- [X] 로또 순위를 표현하는 Ranking 클래스
- [X] 로또 비교 결과를 표현하는 LottoResult 클래스
- [X] 돈을 표현하는 Money 클래스
- [ ] 게임 정보를 표현하는 InputView 클래스 
- [ ] 게임 정보를 표현하는 ResultView 클래스
- [X] 로또 게임의 정보를 표현하는 LottoConstant 클래스
