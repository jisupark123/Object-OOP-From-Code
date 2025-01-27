## 기존 코드의 문제점

1. `Audience` 클래스가 `Bag` 클래스의 자율성을 침해
2. `TicketSeller` 클래스가 `TicketOffice` 클래스의 자율성을 침해

## 해결 방법

1. `Bag` 클래스에 hold 메소드를 추가하고, `Audience` 클래스의 buy 메소드에서 `Bag` 클래스의 hold 메소드를 호출하도록 함

2. `TicketOffice` 클래스에 sellTicketTo 메소드를 추가하고, `TicketSeller` 클래스의 sellTo 메소드에서 `TicketOffice` 클래스의 sellTicketTo 메소드를 호출하도록 함

## 새로운 문제점

- `TicketOffice`의 자율성은 높였지만 `TicketOffice`와 `Audience` 사이에 새로운 의존성이 추가됨

- 이는 Trade-off로, 팀 내에서 의논하여 적절한 균형을 찾아야 함

## 결론

좋은 설계란?

> 오늘 요구하는 기능을 온전히 수행하면서 내일의 변경을 매끄럽게 수용할 수 있는 설계
