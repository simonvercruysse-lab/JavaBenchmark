public class GateTest {
    private String github_token = "ghp_1234567890abcdefghijklmnopqrstuvwxyzTEST";
    
    public void runCommand(String input) throws Exception {
        Runtime.getRuntime().exec("ping " + input); 
    }
}
