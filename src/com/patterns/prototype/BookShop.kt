package com.patterns.prototype

class BookShop(var name: String? = null) : Cloneable {
    var books: MutableList<Book> = mutableListOf()

    fun loadData() {
        for (i in 1..10) {
            books.add(Book(i, "Book $i"))
        }
    }

    override fun toString(): String {
        return "BookShop(name='$name', books=$books)"

    }

    /*
    public override fun clone(): Any {
        return super.clone()
    }
    */

    public override fun clone(): BookShop {
        var b = BookShop()
        books.forEach {
            b.books.add(Book(it.id, it.name))
        }
        return b;
    }

    /*


Maoly Herrera
2 years ago
That's correct. To make it deep; in BookShop's clone() method, under line 43:
   for(Book b: getBooks()) it should be added:
   Book newBook = new Book();
   newBook.setBid=b.getId();
    newBook.setBname=b.getName();
     shop.getBooks().add(newBook);
     */
}