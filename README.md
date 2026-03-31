# IMADA1
# ✨ Social Spark – Stay Connected, One Spark at a Time

**Social Spark** is a simple, engaging Android app that helps you maintain social connections by suggesting small, meaningful actions based on the time of day. It was built with Kotlin in Android Studio and uses `if-else` statements for suggestion logic.

---

## 📖 Table of Contents

- [Purpose & Background](#purpose--background)
- [Features](#features)
- [Screenshots](#screenshots)
- [How to Use](#how-to-use)
- [Technical Details](#technical-details)
- [GitHub & CI/CD](#github--cicd)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Future Improvements](#future-improvements)
- [License](#license)

---

## 🎯 Purpose & Background

This app was created for a friend, **Cora**, who often struggles to keep up with social interactions during busy days. The goal is to make staying connected fun and effortless by providing a quick, time‑based suggestion – whether it’s sending a morning text, sharing a meme in the afternoon, or making a quick evening call.

The app focuses on simplicity: a single input field, a spark suggestion, and a reset button.

---

## ✨ Features

- **Time‑based suggestions** – Enter a time of day (e.g., `Morning`, `Afternoon`, `Dinner`) and receive a tailored social spark.
- **User‑friendly error handling** – If the input is not recognised, a friendly error message suggests valid entries.
- **Reset button** – Clears the input field and the displayed suggestion with one tap.
- **Clean, engaging UI** – Uses gradient background, rounded corners, and calming colors.
- **Built‑in logging** – Logs user input, button clicks, and errors for easy debugging.
- **Automated builds with GitHub Actions** – Ensures the code always compiles correctly.

---

## 📸 Screenshots

<img width="656" height="770" alt="Screenshot 2026-03-31 221843" src="https://github.com/user-attachments/assets/9eba3022-7640-49a3-a2ec-71653646fc2b" />

<img width="798" height="458" alt="Screenshot 2026-03-31 221823" src="https://github.com/user-attachments/assets/c5e5ce68-6be7-4b2a-8174-1d6f6c944c55" />


---

## 🚀 How to Use

1. Launch the app.
2. In the text field, type a time of day (e.g., `Morning`, `Mid‑morning`, `Afternoon`, `Afternoon Snack Time`, `Dinner`, `After Dinner`, or `Night`).
3. Tap **Get Spark**.
4. Read the suggested social action.
5. Use the **Reset** button to clear the field and start over.

> 💡 The app is not case‑sensitive – `morning` and `Morning` both work.

---

## Youtube video

https://youtube.com/shorts/8KNZARjUFnA?si=80783Lzzd1lElXBx

## ⚙️ Technical Details

### **Language & Tools**
- **Kotlin** – Primary language.
- **Android Studio** – Development environment.
- **ConstraintLayout** – For flexible UI design.
- **Git** & **GitHub** – Version control.

### **Suggestion Logic**
The suggestion logic is implemented using a series of `if-else` statements in `MainActivity.kt`. The user’s input is converted to lowercase and compared against predefined strings:

```kotlin
if (lowerInput == "morning") {
    return "☀️ Send a 'Good morning' text to a family member."
} else if (lowerInput == "mid-morning") {
    return "🤝 Reach out to a colleague with a quick 'Thank you.'"
}
