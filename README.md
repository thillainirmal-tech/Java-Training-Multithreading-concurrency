# 🧵 Thread Communication in Java

A simple Java project that demonstrates **inter-thread communication** using methods like `wait()`, `notify()`, and `notifyAll()`. Useful for understanding how threads can cooperate in concurrent applications.

---

## 📌 Features

- Thread synchronization using `synchronized` blocks
- `wait()` and `notify()` mechanism
- Real-world simulation (e.g., Producer-Consumer problem)
- Clean and understandable code structure

---

## 📂 Project Structure

```
thread-communication/
│
├── src/
│   ├── Producer.java
│   ├── Consumer.java
│   └── Main.java
│
├── README.md
└── LICENSE
```

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse) or command line

### Compile & Run

**Using terminal:**

```bash
javac src/*.java
java src.Main
```

---

## 🧠 How It Works

This example simulates a **Producer-Consumer** scenario:

- The **Producer** thread produces data and waits if the buffer is full.
- The **Consumer** thread consumes data and waits if the buffer is empty.
- Both threads use a shared object with `wait()` and `notify()` for communication.

---

## 🧩 Key Concepts

- `wait()` – Causes the current thread to wait until another thread invokes `notify()`.
- `notify()` – Wakes up a single thread waiting on the object's monitor.
- `synchronized` – Ensures that only one thread can access a critical section at a time.

---

## 📸 Demo Output

```
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
...
```

---

## 📘 References

- [Java Docs - Object.wait()](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#wait--)
- [Oracle Tutorial on Concurrency](https://docs.oracle.com/javase/tutorial/essential/concurrency/)

---

## 🧑‍💻 Author

**Thillai Nirmal**  
[GitHub](https://github.com/thillainirmal-tech)

---

## 🪪 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
