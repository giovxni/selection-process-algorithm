# 🧠 Selection Process Algorithm 

This algorithm its made using Java, consist in select a preselection candidate defined in an array (`candidates[]`), a random wage value (`intendedWage()`), based in a method that generates a random double number between 1800 and 2100. To this feature, I utilized a java package of Java Lib:
> `import java.util.concurrent.ThreadLocalRandom`.

## *️⃣ Validating

The base wage its defined in 2000, if the desired wage it`s a value below or equal this base wage, a algorithm starts running, called `selectCandidates()` (brain of the program).

### `selectCandidates()` 🌐

This is the brain of program, them consist all the code and logic, basically, this method will run an algorithm, that will compare wages of each candidate at the maximum of five candidates, then the algorithm will compare again these five selected candidates, and will simulate a call, if they answer or not the algorithm will end, showing the attempts of each candidate, with the result if was successful or not, that part depends upon another method, called `pickUp()`, this that return a randomly boolean value.

> [!NOTE]
> The user doesn't need to input any value, the class (`SelectionProcessLogic`) will be imported to the main class `SelectionProcessUser`.

