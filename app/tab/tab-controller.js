export default class TabController {
    categoryService

    constructor (categoryService) {
        this.categoryService = categoryService;
        this.categoryService.getCategories();

        this.first = 'Angular up and running!'
    }

    setCategoryAsSelected(category) {

    }

    isCategorySelected(category) {
        return category === 'generic'
    }
}
