@echo off
set path=C:\Users\Abdelhamed\.m2\repository\allure\allure-2.15.0\bin;C:\Program Files\Java\jdk-17.0.1\bin;%path%
allure serve allure-results
pause
exit