package chapter5.item24;


/**
 * Eliminate every unchecked warning that you can. If youeliminate all warnings, you are assured that your code is
 * typesafe, which is a verygood thing. It means that you won’t get a ClassCastException at runtime, and it
 * increases your confidence that your program is behaving as you intended
 *
 * If you can’t eliminate a warning, and you can prove that the code thatprovoked the warning is typesafe, then
 * (and only then) suppress the warning with an @SuppressWarnings("unchecked") annotation.
 *
 * Always use the Suppress-Warnings annotation on the smallest scope possible.
 *
 * Every time you use an @SuppressWarnings("unchecked") annotation,add a comment saying why it’s safe to do so.
 */
class EliminateUncheckedWarnings {
}
