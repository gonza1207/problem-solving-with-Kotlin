package main

fun isValidIdentifier(s: String): Boolean {
    if (s.length == 0) {
        return false;
    }

    if (!isLetterOrUnderscore(s[0])) {
        return false;
    }

    for (idx in 1 until s.length) {
        if (!(isLetterOrUnderscore(s[idx]) || isDigit(s[idx]))) {
            return false;
        }
    }
    return true;
}

private fun isLetterOrUnderscore(c: Char) = c == '_' || c in 'a'..'z' || c in 'A'..'Z'
private fun isDigit(c: Char) = c in '0'..'9'