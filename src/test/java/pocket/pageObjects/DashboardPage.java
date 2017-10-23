package pocket.pageObjects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {

    private static String newsTitleText;
    private static int newsSize;

    private static SelenideElement
            userNameField = $(".nav-username"),
            recommendedBtn = $$(".queue_togglesection_text").get(1),
            homeBtn = $$(".queue_togglesection_text").first(),
            myList = $(".section-mylist"),
            deleteBtn = $(".action_delete"),
            confirmDeleteBtn = $(".confirmation_dialog .button-important"),
            favoritesListBtn = $(".section-favorites"),
            archiveListBtn = $(".section-archive"),
            multiAddToFavoriteBtn = $(".bulkedit-favorite a"),
            multiArchiveBtn = $(".bulkedit-archive a"),
            bulkMenu = $(".pagenav_bulkedit a"),
            navMenu = $("#pagenav_options_container"),
            logoutBtn = $(".logout"),
            selectedNewsCount = $(".bulkedit-status p"),
            successMsg = $$(".message").get(1);

    public static SelenideElement
            archiveBtn = $(".action_mark"),
            favoriteBtn = $(".action_favorite");

    private static ElementsCollection
            newsTitle = $$(".title"),
            newsFrame = $$(".item_content"),
            newsLinks = $$(".item_link"),
            checkedFavoriteBtn = $$(".action_favorite.selected"),
            archivedList = $$(".action_mark_archived"),
            saveBtns = $$(".item_content_savetext");

    public static void checkUserNameAtDashboard(String userName){
        userNameField.shouldHave(Condition.text(userName));
    }
    public static void goToRecommendedNews(){
        recommendedBtn.click();
    }
    public static void addNewsToMyList(int index) {
        newsTitleText = newsTitle.get(index-1).getText();
        saveBtns.get(index-1).click();
        successMsg.shouldBe(visible);
    }
    public static void checkNewsTitleAtMyList(int n){
        homeBtn.click();
        myList.click();
        newsTitle.get(n-1).shouldHave(text(newsTitleText)).shouldBe(visible);
    }
    public static void deleteTheFirstNewsFromMyList(int n){
        newsTitleText = newsTitle.get(n-1).shouldBe(visible).getText();
        newsFrame.get(n-1).hover();
        deleteBtn.shouldBe(visible).click();
        confirmDeleteBtn.click();
    }
    public static void checkNewsNotDisplayed(){
        newsTitle.findBy(text(newsTitleText)).shouldNotBe(visible);
    }
    public static void checkNewsInDisplayed(){
        newsTitle.findBy(text(newsTitleText)).shouldBe(visible);
    }
    public static void saveNumbersOfNews(){
        newsSize = newsLinks.size();
    }
    public static void removeNewsFromTheFavoriteList(int n){
        newsTitleText = newsTitle.get(n-1).getText();
        goToFavorites();
        newsFrame.get(n-1).hover();
        checkedFavoriteBtn.get(n-1).click();
    }
    public static void logout(){
        navMenu.click();
        logoutBtn.click();
        LoginPage.loginField.shouldBe(visible);
    }
    public static void checkNumbersOfNewsAtAnotherUsersList(){
        newsLinks.shouldHave(CollectionCondition.sizeNotEqual(newsSize));
    }
    public static void goToMyList(){
        myList.click();
    }
    public static void openBulkMenu(){
        bulkMenu.click();
    }
    public static void multiSelectNewsFromTo(int fromIndex, int toIndex){
        int b = toIndex-1;
        for (int a=fromIndex-1; a<=b; a++ ){
            newsFrame.get(a).click();
        }
        int selected = toIndex-fromIndex+1;
        selectedNewsCount.shouldHave(matchText(""+selected+""));
    }
    public static void multiAddToFavorite(){
        multiAddToFavoriteBtn.click();
    }
    public static void multiAddToArchive(){
        multiArchiveBtn.click();
    }
    public static void goToFavorites(){
        favoritesListBtn.click();
    }
    public static void checkNumberOfNewsGreaterThanActual(){
        newsLinks.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(newsSize));
    }
    public static void checkNumberOfNewsIsLessThanActual(){
        newsLinks.shouldHave(CollectionCondition.sizeLessThan(newsSize));
    }
    public static void addNewsTo(SelenideElement element,int n) {
        newsTitleText = newsTitle.get(n-1).getText();
        newsFrame.get(n-1).hover();
        element.shouldBe(visible).click();
    }
    public static void goToArchive(){
        archiveListBtn.click();
    }
    public static void removeTheFirstNewsFromArchive(int n){
        newsTitleText = newsTitle.get(n-1).shouldBe(visible).getText();
        newsFrame.get(n-1).hover();
        archivedList.get(n-1).shouldBe(visible).click();
    }
}
