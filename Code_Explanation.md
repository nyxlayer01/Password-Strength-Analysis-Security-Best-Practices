# Code Explanation - Java Password Strength Checker

This program checks the strength of a given password by evaluating it against multiple security criteria. 
It assigns a score based on how many criteria are met and then categorizes the password as Very Weak, Weak, Moderate, Strong, or Very Strong.

## Step-by-Step Process

### User Input
- The program uses a `Scanner` to prompt the user:
  ```
  Enter the password :
  ```
- The entered password is stored in the variable `password`.

### Initialize Score
- A variable `strength_points` starts at 0.
- This will store how many password rules are satisfied.

### Length Checks
- If the password is **8 or more characters** → +1 point.
- If the password is **12 or more characters** → +1 point.

### Uppercase Letter Check
- Uses regex `.*[A-Z].*` to check if the password contains at least one uppercase letter.

### Lowercase Letter Check
- Uses regex `.*[a-z].*` to check if the password contains at least one lowercase letter.

### Number Check
- Uses regex `.*[0-9].*` to check for at least one numeric digit.

### Special Character Check
- Uses regex `.*[^A-Za-z0-9].*` to check if there is at least one special character.

### Scoring System
- Each satisfied condition adds **1 point** to the `strength_points` counter.
- Final score determines strength:
  - 0–2 points → Very Weak  
  - 3 points → Weak  
  - 4 points → Moderate  
  - 5 points → Strong  
  - 6 points → Very Strong  

### Output
- Based on `strength_points`, the program prints the corresponding password strength level.

## Example Run
```
Enter the password : T!m3_To$h!ne_2025
Very strong password
```
