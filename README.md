# value-spel


## Inject Map from file
Inject Map key-values from a file

Define 

mapValues={key:'value', key1:'value1',key3:'value3'} 

in a property file.

Using @Vlaue injection and Spel expression

````
@Value("#{${mapValues}}")
Private Map<String,String> mapValues; 
````

## Set profile from JVM system parameter

VM options: -Dspring.profiles.active=shape

in case selecting more than one profiles, using comman to separate them

-Dspring.profiles.active=shape,cut

## Programmatically set active profile

injecting an Enviornment instance. 


