class ListSortable<E extends KLTN<?, ?>> {
    private java.util.List<E> list;

    public ListSortable() {
        this.list = new java.util.ArrayList<>();
    }

    public void add(E element) {
        list.add(element);
    }

    public void print() {

        list.sort(java.util.Comparator.comparing(e -> e.topic().toLowerCase()));

        System.out.println("=== DANH SÁCH KHÓA LUẬN ===");
        for (E thesis : list) {
            System.out.println(thesis);
            System.out.println("--------------------------");
        }
    }
}
