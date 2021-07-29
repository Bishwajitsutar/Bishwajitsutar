set projectLocation=C:\Users\USER\eclipse-workspace\Selenium_2
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\NewFile.xml