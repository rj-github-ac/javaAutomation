package runners;



import com.intuit.karate.junit5.Karate;


class TestsRunner {
    
    @Karate.Test
    Karate testmyFF() {
        return Karate.run("classpath:/features/myFF.feature").tags("@TestCurrent");
    }
    
    

}
