# Swarm Arquillian versions

Simple test that prints versions of various Arquillian JARs
that are brought transitively from WildFly Swarm.

This is the relevant part of stdout after running `mvn clean test`
on my computer:
```
!!! Arquillian Core API = 1.1.12.Final
!!! Arquillian Core SPI = 1.1.10.Final
!!! Arquillian Core Implementation Base = 1.1.10.Final
!!! Arquillian Container SPI = 1.1.10.Final
!!! Arquillian Container Implementation Base = 1.1.10.Final
!!! Arquillian Config API = 1.1.10.Final
!!! Arquillian Config Implementation Base = 1.1.12.Final
!!! Arquillian Container Test API = 1.1.10.Final
!!! Arquillian Container Test SPI = 1.1.10.Final
!!! Arquillian Container Test Implementation Base = 1.1.10.Final
!!! Arquillian Test API = 1.1.10.Final
!!! Arquillian Test SPI = 1.1.10.Final
!!! Arquillian Test Implementation Base = 1.1.10.Final
!!! Arquillian TestRunner JUnit Core = 1.1.10.Final
!!! Arquillian TestRunner JUnit Container = 1.1.10.Final
!!! Arquillian TestEnricher CDI = 1.1.10.Final
!!! Arquillian TestEnricher EJB = 1.1.10.Final
!!! Arquillian TestEnricher InitialContext = 1.1.10.Final
!!! Arquillian TestEnricher Resource = 1.1.10.Final
```
