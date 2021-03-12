public class Cooldown {
  // Your cooldowns will be stored here.
  // The Integer is identifier, can be anything else.
  // The Long is the most recent execution of your method.
  
  public static final HashMap<Integer, Long> pluginMessageCooldown = new HashMap<>();
  
  
  // This is your code... For example sending a staff alert...
  public static void alertStaff() {
    // The 420 is identifier. If you had more stuff to cooldown, you can use the same hashmap to make your code look neat!
    // in milliseconds, 1.5 seconds.
    
    int cooldownTime = 1500;
    
    if (pluginMessageCooldown.containsKey(420)) {
      long secondsLeft = ((pluginMessageCooldown.get(420)) + cooldownTime) - (System.currentTimeMillis());
      if (secondsLeft > 0) {
        return;
      }
    }
    pluginMessageCooldown.put(420, System.currentTimeMillis());
    
    
    // Your code goes here...
    // Anything you wish...
    
  }
  
}
