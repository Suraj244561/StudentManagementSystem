# JVM Architecture Report

## Components of JVM

### 1. Class Loader
- Loads Java classes (.class files) into memory
- Bootstrap, Extension, Application ClassLoaders

### 2. Runtime Data Areas
- **Heap**: Object storage (garbage collected)
- **Stack**: Method calls and local variables
- **Method Area**: Class structures

### 3. Execution Engine
- **Interpreter**: Line-by-line bytecode execution
- **JIT Compiler**: Converts hot bytecode to native code

## Bytecode Execution Process

Java Source → Compiler → Bytecode → JVM → CPU

## JIT vs Interpreter

| Feature | Interpreter | JIT Compiler |
|---------|------------|-------------|
| Speed | Slower | Faster |
| Process | Line by line | Batch compilation |
| Startup | Fast | Slower first run |
| Reuse | Slow on repeat | Fast on repeat |

## Write Once, Run Anywhere

Same bytecode runs on:
- Windows JVM ✓
- Linux JVM ✓
- Mac JVM ✓

Java's biggest strength - platform independence.
