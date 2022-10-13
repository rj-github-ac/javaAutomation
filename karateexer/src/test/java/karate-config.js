function fn(){
    
    var env = karate.env; // get java system property 'karate.envData' from TestRunner.java
    
      karate.log('karate.envData system property was:', env);
    
    if (!env) {
        env = 'dev'; // a custom 'intelligent' default
      }
      
      var config = {
      
      apiSrvrURL : 'https://demoqa.com/BookStore/v1'
      };
      
      return config;
      
    
        }