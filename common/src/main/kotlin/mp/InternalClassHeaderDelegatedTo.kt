package mp

/**
 * This class provides the multi-platform implementation for [CommonClassDelegatingToInternalClassHeader].
 */
internal expect class InternalClassHeaderDelegatedTo(owner: CommonClassDelegatingToInternalClassHeader) {
    fun doIt()
}
