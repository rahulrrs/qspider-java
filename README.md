# Java QSpiders Practice

This workspace is organized by topic:

- `src/basics` - console input, loops, conditions, calculator, tables
- `src/arrays` - array input, sorting, duplicate checks
- `src/matrix` - matrix printing and spiral traversal
- `src/numbers` - prime number and palindrome programs
- `src/oop` - object-oriented practice
- `src/searching` - searching algorithms
- `src/tcs` - TCS practice programs
- `scripts/python` - Python practice files

## Compile

```powershell
$files = Get-ChildItem -Recurse .\src -Filter *.java
javac -d out $files.FullName
```

## Run Examples

```powershell
java -cp out basics.Even
java -cp out arrays.ArrSort
java -cp out numbers.Prime
java -cp out matrix.SpiralMatrix
java -cp out oop.Instant
java -cp out tcs.Arr
```

Generated `.class` files, build folders, and temporary Code Runner files are ignored by Git.
