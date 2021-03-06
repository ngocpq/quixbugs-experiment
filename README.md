## Automatic repair experiment on QuixBugs.

This experiment is to evaluate effectiveness of two representative automatic repair tools Astor and Nopol on repairing [QuixBugs](https://github.com/jkoppel/QuixBugs) benchmark. QuixBugs is a benchmark suite of 40 confirmed bugs from classic algorithms with a bug on a single line of code. Before we start our experiment, we did some [preperation work](https://github.com/jkoppel/QuixBugs/pulls?q=is%3Apr+is%3Aclosed) to contribute QuixBugs as a usable repair benchmark in Java programs.

In our experiment, we focus on two parts:

```

# How many QuixBugs programs could be repaired by two considered tools?

# How to assess the correctness of generated patches?

```



### Folder Structure

[Buggy Java Programs](https://github.com/KTH/quixbugs-experiment/tree/master/src/main/java/buggy_java_programs) are 40 buggy programs from QuixBugs and Corresponding [Junit Tests](https://github.com/KTH/quixbugs-experiment/tree/master/src/test/java/buggy_java_programs)

[Reference Programs](https://github.com/KTH/quixbugs-experiment/tree/master/src/main/java/java_programs) are the ground truth version based on the provided correct Python version from QuixBugs.

[Patches](https://github.com/KTH/quixbugs-experiment/tree/master/patches) contains all patches generated by Astor and Nopol.

[Evosuite Tests and InputSampling Tests](https://github.com/KTH/quixbugs-experiment/tree/master/generatedTests) are the independent tests generated based reference programs, to assess patches generated by Astor and Nopol. 

[Patch Correctness Assessment](https://github.com/KTH/quixbugs-experiment/tree/master/patches_assessment_report) are the assessment reports of each patch when runing different number tests.


### Getting started

##### Check out the project:

```
git clone https://github.com/KTH/quixbugs-experiment.git
cd quixbugs-experiment
mvn clean install -DskipTests
cd ..
```

##### Class to generate tests by InputSampling
```
simpletest.generator.InputSampling
```


##### Class to generate tests by Evosuite

```
simpletest.generator.QuixBugExtendedOracle

```

##### Patch correctness assessment:

To assess patches ,for example, by using 30 Evosuite test suites:

```
java -cp /path/to/junit-4.9.jar org.junit.runner.JUnitCore qfevotest.generator.PatchAssessmentTest#testResultsByRunning30Seeds

```
To assess patches ,for example, by using 300 InputSampling tests:

```
java -cp /path/to/junit-4.9.jar org.junit.runner.JUnitCore qfevotest.generator.PatchAssessmentTest#inputSampling_300_assessment
```

### Test Coverage 
[QuixBugs_original_tests](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/original_tests/index.html)

[Evosuite](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/Evosuite/index.html)

[InputSampling](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/InputSampling/index.html)

[EvosuiteAndInputSampling](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/InputSamplingAndEvosuite/index.html)


### Preconditions

Some programs of QuixBugs have preconditions that constraints the input domain. It is important to clear about the preconditions when sampling the input domain for genereating tests in InputSampling.

| program | preconditions|
| --- |---|
|bitcount|A nonnegative int|
|breadth_first_search|-|
|bucketsort|0 <= x < k for x in arr|
|depth_first_search|-|
|detect_cycle|-|
|find_first_in_sorted| -|
|find_in_sorted|A sorted list of ints|
|flatten| The input has no list containment cycles|
|gcd|A and b are nonnegative int|
|get_factors|n >= 1|
|hanoi|The height >= 0 start peg and end peg in (1, 2, 3)|
|is_valid_parenthesization|paren in '()'|
|kheapsort|The elements of arr are unique and each element is at most k places from its sorted position|
|knapsack|-|
|kth|The arr is a list of ints and k is an int, 0 <= k < len(arr)|
|levenshtein|-|
|lis|The ints in arr are unique|
|longest_common_subsequence| -|
|max_sublist_sum| -| 
|mergesort|-|
|minimum_spanning_tree|The input graph is connected|
|next_palindrome|The initial input array represents a palindrome|
|next_permutation|The perm is not sorted in reverse order|
|pascal|The n is the number of rows to return and n>=1|
|possible_change|-|
|powerset| The array is a list of ints|
|quicksort|the ints in arr are unique|
|reverse_linked_list|The input is acyclic|
|rpn_eval|token in ('+', '-', '*', '/')|
|shortest_path_length|The length > 0 for length in length by edge|
|shortest_path_lengths|There are no negative-length cycles in the input graph|
|shortest_paths|The input graph contains no negative-weight cycles|
|shunting_yard| isinstance(token, int) or token in '+-*/' |
|sieve| - |
|sqrt|The x >= 1 and epsilon > 0|
|subsequences|The a and b are ints and k is a positive int|
|to_base|The num > 0, 2 <= b <= 36|
|topological_ordering|The input graph is acyclic|
| wrap|The target column width>0|



### Tests to prove manual analysis of patch correctness
While manual analysis of patch correctness, if a patch is considered as incorrect, the author must show a test that the same input would have two different ouputs between patch program and reference program.

|Patch| Input | Output from reference program | Output from patched program|
| --- |---| --- |---|
|depth_first_search(Astor)-p0| new Node( "MkLlUfgc",new ArrayList<Node>(Arrays.asList( new Node("a")))) , new Node( "UCmpcBi",new ArrayList<Node>(Arrays.asList(new Node("HtpbRgv"))) | false | true|
  |depth_first_search(Astor)-p1| new Node("j,ava_programs.Node") , Node node1 = new Node("j,ava_programs.Node", new Node("j,ava_programs.Node"))| false | Stack overflow|
 |depth_first_search(Astor)-p2| new Node("j,ava_programs.Node") , Node node1 = new Node("j,ava_programs.Node", new Node("j,ava_programs.Node"))| false | Stack overflow|
   |depth_first_search(Nopol)| new Node("j,ava_programs.Node") , Node node1 = new Node("j,ava_programs.Node", new Node("j,ava_programs.Node"))| false | Stack overflow|
  |find_in_sorted(Nopol)| [21,33,45,67,69,70], 100|-1|3|
  |get_factors(Nopol)| 0 | 0 | Arithmetical exception|
|next_permutation(Astor)|[1,3,2,2,1,3,1] |[1,3,2,2,3,1,1]|[1,3,2,2,1,1,3]|
|is_valid_parenthesization(Astor)|"(((())(())"|false|true|
|powerset(Astor)-p0|new ArrayList(Arrays.asList( "a","l"))|[[],[l],[a],[a,l]]|[[],[l],[a,l]]| 
|powerset(Astor)-p1|new ArrayList(Arrays.asList( "a","l"))|[[],[l],[a],[a,l]]|[[]]|  
|powerset(Astor)-p2|new ArrayList(Arrays.asList( "a","l"))|[[],[l],[a],[a,l]]|[[],[l],[a,l]]|  
|shortest_path_lengths(Astor)|HashMap <List<Integer>,Integer> map = new HashMap<List<Integer>,Integer>(); map.put(new ArrayList<Integer>(Arrays.asList(2,6)), 8);|{[0, 0]=0, [0, 1]=99999, [0, 2]=99999...}|{[0, 0]=0, [0, 1]=99999}|    
  
  
### Failing Evosuite Tests

Evosuite generates test cases that fail on the version used for generating them, more information [here](https://github.com/KTH/quixbugs-experiment/issues/1). These failing tests will result in incorrect patch assessment result. To address this problem, we first run all Evosuite test over corresponding the referecen program (using [this](https://github.com/KTH/quixbugs-experiment/blob/master/src/test/java/qfevotest/generator/PatchAssessmentTest.java#L228) method to check), then manually remove the failing tests. 

| program | reason|
| --- |---|
|find_in_sorted|Undeclared exception |
|get_factors|Undeclared exception|
|knapsack |Undeclared exception|
|levenshtein| Undeclared exception|
|next_permutation|Undeclared exception|
|shortest_path_lengths|Undeclared exception|
  




