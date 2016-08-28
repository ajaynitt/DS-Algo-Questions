Problem : Longest Common Subsequence (LCS)
Longest Common Subsequence - Dynamic Programming - Tutorial and C Program Source code

Given a sequence of elements, a subsequence of it can be obtained by removing zero or more elements from the sequence, preserving the relative order of the elements. Note that for a substring, the elements need to be contiguous in a given string, for a subsequence it need not be. Eg: S1="ABCDEFG" is the given string. "ACEG", "CDF" are subsequences, where as "AEC" is not. For a string of lenght n the total number of subsequences is 2n ( Each character can be taken or not taken ). Now the question is, what is the length of the longest subsequence that is common to the given two Strings S1 and S2. Lets denote length of S1 by N and length of S2 by M.

BruteForce : Consider each of the 2N subsequences of S1 and check if its also a subsequence of S2, and take the longest of all such subsequences. Clearly, very time consuming.

Recursion : Can we break the problem of finding the LCS of S1[1...N] and S2[1...M] in to smaller subproblems ?
