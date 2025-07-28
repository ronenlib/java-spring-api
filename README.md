# Generate from template

```
cd ..

openapi-generator generate \
  -i java-spring-api/api.yaml \
  -g spring \
  --library spring-boot \
  -o java-spring-api \
  --skip-overwrite \
  --additional-properties=springBootVersion=3.1.5,useJakartaEe=true,delegatePattern=true,returnResponse=true,interfaceOnly=true,skipDefaultInterface=true,apiPackage=org.openapitools.api,modelPackage=org.openapitools.model
```