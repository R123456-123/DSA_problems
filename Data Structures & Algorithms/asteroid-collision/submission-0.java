class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    
        // We use an array to simulate the stack. 
        // In the worst case, no asteroids collide, so we need asteroids.length space.
        int[] res = new int[asteroids.length]; 
        int top = -1; // This pointer tracks the top of our "stack"

        for (int asteroid : asteroids) {
            boolean isAlive = true;

            // Same logic, but using res[top] instead of stack.peek()
            while (top >= 0 && asteroid < 0 && res[top] > 0) {
                
                if (res[top] < Math.abs(asteroid)) {
                    top--; // Decrease pointer = "popping" the smaller asteroid
                    // We don't break, the incoming asteroid keeps checking
                } 
                else if (res[top] == Math.abs(asteroid)) {
                    top--; // Both explode
                    isAlive = false;
                    break;
                } 
                else {
                    isAlive = false; // Incoming asteroid explodes
                    break;
                }
            }

            // If it survives, "push" it by incrementing top and adding it to the array
            if (isAlive) {
                top++;
                res[top] = asteroid;
            }
        }

        // Return a copy of the array containing only the surviving asteroids
        return Arrays.copyOf(res, top + 1);
    }
}