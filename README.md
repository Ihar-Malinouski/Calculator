## _**Описание классов и старниц:**_
1) CalculatorPage - содержит 4 метода:
        - additionOfNumbers - сложение двух чисел
        - subtractionOfNumbers - вычитание 2-х чисел
        - multiplicationOfNumbers - умножение 2-х чисел
        - divisionOfNumbers - деление 2-х чисел
2) AdditionTest - содержит проверки на сложение чисел
3) DivisionTest - содержит проверки на деление чисел
4) MultiplicationTest - содержит проверки на умножение чисел
5) SubtractionTest - содержит проверки на вычетание чисел

## _**Используемые groups для тестов:**_
1) Smoke - основные положительные сценариии
2) Regression - тесты, применяемые для регрессионного тетсирования
3) Critical - тесты критического пути
4) Parametrs - тесты, с входными параметрами из файла Parametrs.xml

## _**Применяемые XML для запуска тестов:**_
1) All smoke tests.xml - все SMOKE поверки в рамках всего проекта
2) ALL TESTS.xml - все кейсы всех классов в рамках проекта
3) Smoke tests for addition.xml - все SMOKE поверки в рамках тестового класса AdditionTest
4) Smoke tests for division.xml - все SMOKE поверки в рамках тестового класса DivisionTest
5) Smoke tests for miltiplication.xml - все SMOKE поверки в рамках тестового класса MultiplicationTest
6) Smoke tests for subtraction.xml - все SMOKE поверки в рамках тестового класса SubtractionTest

