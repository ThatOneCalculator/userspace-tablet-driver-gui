package dev.villanueva.userland_utility.products.xppen.artist_pro_16

import dev.villanueva.userland_utility.products.ProductSingleSideShortcutsView

class ArtistPro16View : ProductSingleSideShortcutsView() {
    private val myController: Innovator16Controller by inject()

    init {
        super.controller = myController
        setup()
    }
}