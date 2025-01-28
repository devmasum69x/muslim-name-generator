# 🌙 Muslim Name Generator

[![](https://jitpack.io/v/devmasum69x/muslim-name-generator.svg)](https://jitpack.io/#devmasum69x/muslim-name-generator)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)

A powerful and easy-to-use Android library for generating authentic Muslim names. Perfect for apps needing Islamic name suggestions or random name generation functionality.

## ✨ Features

- 🔄 Generate random Muslim names
- 👨 Male name generation
- 👩 Female name generation
- 📝 Multiple names generation
- 🎲 Custom random seed support
- ⚡ Lightweight and efficient
- 📱 Android 5.0 (API 21) and above

## 📦 Installation

Add JitPack repository to your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency:

```groovy
dependencies {
    implementation 'com.github.devmasum69x:muslim-name-generator:1.0.3'
}
```

## 🚀 Usage

### Basic Usage

```java
// Initialize the generator
MuslimNameGenerator generator = new MuslimNameGenerator();

// Generate a single male name
String maleName = generator.generateMaleName();
// Example output: "Ibrahim"

// Generate a single female name
String femaleName = generator.generateFemaleName();
// Example output: "Fatima"
```

### Generate Multiple Names

```java
// Generate 5 male names
List<String> maleNames = generator.generateMaleNames(5);
// Example output: ["Muhammad", "Ahmad", "Omar", "Ali", "Hassan"]

// Generate 5 female names
List<String> femaleNames = generator.generateFemaleNames(5);
// Example output: ["Aisha", "Khadija", "Maryam", "Zainab", "Safiya"]
```

### Using Custom Seed

```java
// Create generator with custom seed for reproducible results
MuslimNameGenerator seededGenerator = new MuslimNameGenerator(42L);
String name1 = seededGenerator.generateMaleName();
String name2 = seededGenerator.generateFemaleName();
```

## 📝 Example App

Here's a simple example of how to use the library in your Android app:

```java
public class MainActivity extends AppCompatActivity {
    private MuslimNameGenerator nameGenerator;
    private TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameGenerator = new MuslimNameGenerator();
        nameTextView = findViewById(R.id.nameTextView);

        Button generateMaleButton = findViewById(R.id.generateMaleButton);
        Button generateFemaleButton = findViewById(R.id.generateFemaleButton);

        generateMaleButton.setOnClickListener(v -> {
            String name = nameGenerator.generateMaleName();
            nameTextView.setText(name);
        });

        generateFemaleButton.setOnClickListener(v -> {
            String name = nameGenerator.generateFemaleName();
            nameTextView.setText(name);
        });
    }
}
```

## 🤝 Contributing

Contributions are welcome! Here are a few ways you can help:

1. Report bugs
2. Suggest new features
3. Add more names to the database
4. Improve documentation
5. Submit pull requests

## 📄 License

```
MIT License

Copyright (c) 2025 Mahmud Mahmud

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## 📞 Contact

- GitHub: [@devmasum69x](https://github.com/devmasum69x)
- Email: devmasum69x@gmail.com

---
Made with ❤️ by [Mahmud Mahmud](https://github.com/devmasum69x)
