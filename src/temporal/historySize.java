/**
 * Thanks for your quick response!
 * I’m now able to access the history size.
 * It turns out I was using an older version of the SDK,
 * which is why I wasn’t able to see it.
 * After updating to the latest version (1.28.3),
 * I can access the history size and successfully implement the changes.
 */
/**
 * @return length of Workflow history up until the current moment of execution. This value changes
 *     during the lifetime of a Workflow Execution. You may use this information to decide when to
 *     call {@link Workflow#continueAsNew(Object...)}.
 */
long getHistoryLength();

/**
 * @return size of Workflow history in bytes up until the current moment of execution. This value
 *     changes during the lifetime of a Workflow Execution.
 */
long getHistorySize();