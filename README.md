# Muslim Name Generator

A simple Android library for generating Muslim names. This library provides a collection of traditional Muslim names and allows you to generate random names for both male and female.

## Features
- Generate random male Muslim names
- Generate random female Muslim names
- Generate multiple names at once
- Support for custom random seed

## Installation

Add JitPack repository to your root build.gradle:

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
    implementation 'com.github.yourusername:muslim-name-generator:1.0.0'
}
```

## Usage

```java
// Create a new instance
MuslimNameGenerator generator = new MuslimNameGenerator();

// Generate a single male name
String maleName = generator.generateMaleName();

// Generate a single female name
String femaleName = generator.generateFemaleName();

// Generate multiple male names
List<String> maleNames = generator.generateMaleNames(5);

// Generate multiple female names
List<String> femaleNames = generator.generateFemaleNames(5);

// Use with custom seed for reproducible results
MuslimNameGenerator seededGenerator = new MuslimNameGenerator(42L);
```

## License

```
MIT License

Copyright (c) 2025 Your Name

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
