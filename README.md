[ ![Codeship Status for jarheadjred/coinkite-java](https://codeship.io/projects/20fafae0-b87c-0132-2c2e-668bc7234501/status)](https://codeship.io/projects/71411)


# coinkite-java
Java Coinkite API Client

https://docs.coinkite.com/api/index.html#api-table-of-contents

### Env Dependencies
In order to use this library it needs to have access to your coinkite secret and public key. There are a few unittests 
in place to verify that you have set them correctly. In general you will want to pass them as jvm runtime arguments.

java -jar <yourjarname> -DX-CK-Key=<your key> -DX-CK-Sign=<your secret key>



