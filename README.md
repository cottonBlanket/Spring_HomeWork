# Spring_HomeWork

домашка по лекции Конфиги и профили:
1) Создать 3 профиля - dev, test, prod, каждый из которых будет включать в себя:
    
конфиг с листом из нескольких значений
название приложения
конфиг с переменной окружения, по дефолту значение - default
2) 3 бина: 
    
один создается, только если профиль test, 
другой, если существует первый бин, 
третий, если в конфиге EXAMPLE_TEST (env var) не “default” (тут в идеале со скриншотом)

Скриншоты для последнего задания:
  Переменная окружения default: 
  Создается три бина - uno, due, tre
  ![image](https://user-images.githubusercontent.com/102159807/234368215-dc1866c3-5654-41b8-b59c-2b5ff9a95092.png)
  
  
  Переменная окружения не default: 
  Третий бин не создается
  ![image](https://user-images.githubusercontent.com/102159807/234368116-a4e9efd7-5e4f-4296-a779-f442734d1420.png)

