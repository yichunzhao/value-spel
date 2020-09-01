# value-spel


## Inject Map from file
Inject Map key-values from a file

Define 

mapValues={key:'value', key1:'value1',key3:'value3'} 

in a property file, ref. to key-value pattern: {key-name:'value'}

Using @Vlaue injection and Spel expression

````
@Value("#{${mapValues}}")
Private Map<String,String> mapValues; 
````

## Set profile from JVM system parameter

VM options: -Dspring.profiles.active=shape

in case selecting more than one profiles, using comma to separate them

-Dspring.profiles.active=shape,cut

## Programmatically set active profile

It may inject an Enviornment instance in the Spring, and then setActiveProfile 


