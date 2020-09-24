# Zuul Eurka Example

## Zuul Discovery Server
* Maven Command
```
mvn archetype:generate -DgroupId=com.discovery.server -DartifactId=discovery-server -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Account Service
* Maven Command
```
mvn archetype:generate -DgroupId=com.accounts.service -DartifactId=accounts-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Zuul Gateway
* Maven Command
```
mvn archetype:generate -DgroupId=com.zuul.gateway -DartifactId=zuul-gateway -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```