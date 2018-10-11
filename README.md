# Pattern Exam
1. Strategy Pattern 
  - 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
  - exam.pattern.strategy 하위에 예제 구현
  - Weapon 인터페이스를 구현한 Knife, Sword 를 GameCharacter에서 setWeapon 으로 바꿔가며 사용
  - 인터페이스를 사용하여 선언하고 해당 내용을 구현한 구현체(전략)을 실제 사용하는쪽(GameCharacter)에서 알맞게 바꿔가면서 사용
