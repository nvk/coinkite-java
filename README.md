[ ![Codeship Status for blocktrustorg/coinkite-java](https://codeship.io/projects/da3341f0-bdc4-0132-6764-62522b742a1f/status)](https://codeship.io/projects/72608)


# coinkite-java
Java Coinkite API Client

https://docs.coinkite.com/api/index.html#api-table-of-contents

### Env Dependencies
In order to use this library it needs to have access to your coinkite secret and public key. There are a few unittests 
in place to verify that you have set them correctly. In general you will want to pass them as jvm runtime arguments.

java -jar &lt;yourjarname&gt; -DX-CK-Key=&lt;your key&gt; -DX-CK-Sign=&lt;your secret key&gt;



