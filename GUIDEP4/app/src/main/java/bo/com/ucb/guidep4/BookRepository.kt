package bo.com.ucb.guidep4

class BookRepository(private val bookDao: IBookDao) {

    fun insert(book: Book) {
        bookDao.insert(book)
    }

    fun getListBooks(): List<Book> {
        return bookDao.getList()
    }
}
