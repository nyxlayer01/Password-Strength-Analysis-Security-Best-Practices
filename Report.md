# Password Strength Evaluation Report

## Objective
The purpose of this task is to:
- Understand what makes a password strong.
- Test multiple passwords with varying complexity using an online password strength checker.
- Document the results and extract best practices for secure password creation.

## Methodology
- Generated passwords with different complexity levels, ranging from very weak to very strong.
- Incorporated variations in:
  - Length
  - Use of uppercase and lowercase letters
  - Inclusion of numbers
  - Special characters
- Used [PasswordMeter.com](https://passwordmeter.com/) to assess password strength.

## Password Evaluation Results

| Password | Strength Level | Feedback from Password Checker |
|----------|----------------|--------------------------------|
| abc123 | Very Weak | Very short, predictable, no uppercase, no symbols; easy to guess with brute force or dictionary attacks. |
| password | Weak | Commonly used dictionary word, no numbers or symbols, predictable pattern. |
| Abcdef12 | Moderate | Includes uppercase and lowercase letters with numbers, lacks symbols and could be longer. |
| S@yMyN8meg | Strong | Good mix of characters including numbers and a symbol, slightly shorter than recommended maximum security length. |
| Sun&Leaf92!SkyDoor | Very Strong | Excellent length, varied character set, unpredictable structure; resistant to most password attacks. |

## Best Practices for Strong Passwords
- Use a minimum of **12–16 characters**.
- Mix **uppercase**, **lowercase**, **numbers**, and **symbols**.
- Avoid dictionary words or personal information.
- Use **passphrases** that are memorable but hard to guess.
- Keep passwords **unique** per account.
- Store them in a **password manager**.

## Common Password Attacks
- **Brute Force** – Tries all combinations; complexity and length make it exponentially harder.
- **Dictionary Attack** – Uses lists of common words; avoided by randomness and symbols.
- **Credential Stuffing** – Reuses stolen credentials; avoided by having unique passwords.
- **Phishing/Social Engineering** – Tricks users into revealing passwords; avoided through user awareness and verification.

## How Complexity Improves Security
- Each added character increases attack time exponentially.
- Mixed character types reduce susceptibility to guessing attacks.
- Random, unique strings resist dictionary and credential reuse attacks.

## Conclusion
Password security depends on **length**, **character variety**, and **randomness**. Following best practices drastically improves resistance to common attacks, protecting personal and organizational data.
