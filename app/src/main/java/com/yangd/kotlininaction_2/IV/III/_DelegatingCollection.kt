package com.yangd.kotlininaction_2.IV.III

class DelegatingCollection<T>: Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int
        get() = innerList.size

    override fun contains(element: T): Boolean =innerList.contains(element)

    override fun containsAll(elements: Collection<T>): Boolean =innerList.containsAll(elements)

    override fun isEmpty(): Boolean =innerList.isEmpty()

    override fun iterator(): Iterator<T> =innerList.iterator()

}