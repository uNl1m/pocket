package pocket.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pocket.pageObjects.DashboardPage;
import pocket.pageObjects.LoginPage;
import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {


    @Given("^I open getpocket\\.com$")
    public void i_open_getpocket_com() {
        open("");
    }
    @Then("^I see my user name$")
    public void i_see_my_user_name()  {
        DashboardPage.checkUserNameAtDashboard("testuser");
    }
    @Then("^I should see the validation error message$")
    public void i_should_see_the_validation_error_message() {
       LoginPage.checkErrorMessage();
    }

    @Then("^I sign in$")
    public void sign_in()  {
        LoginPage.signIn("test12@test.com","123456");
        DashboardPage.checkUserNameAtDashboard("testuser");
    }
    @Then("^I sign invalid user name$")
    public void i_sign_invalid_user_name() {
        LoginPage.signIn("someuser@test.com","123123");
    }
    @Then("^I sign in with empty fields$")
    public void i_sign_in_with_empty_fields(){
        LoginPage.signIn("","");
    }

    @Then("^I sign invalid password$")
    public void i_sign_invalid_password() {
        LoginPage.signIn("test12@test.com","123123");
    }
    @Then("^I should see the validation error messages$")
    public void i_should_see_the_validation_error_messages() {
        LoginPage.checkErrorMessages();
    }
    @Then("^go to recommended news$")
    public void go_to_recommended_news()  {
        DashboardPage.goToRecommendedNews();
    }
    @Then("^add news nr (\\d+) from the list$")
    public void add_news_nr_from_the_list(int arg1) {
        DashboardPage.addNewsToMyList(arg1);
    }
    @Then("^check title of added news on my list$")
    public void check_title_of_news_on_my_list() {
        DashboardPage.checkNewsTitleAtMyList(1);
    }

    @Then("^I delete the first news$")
    public void i_delete_the_first_news() {
        DashboardPage.deleteTheFirstNewsFromMyList(1);
    }

    @Then("^I check that news is deleted from my list$")
    public void i_check_that_news_is_deleted_from_my_list() {
        DashboardPage.checkNewsNotDisplayed();
    }

    @Then("^I add the first news in my list to the favorite$")
    public void i_add_the_first_news_in_my_list_to_the_favorite() {
        DashboardPage.addNewsTo(DashboardPage.favoriteBtn,1);
    }

    @Then("^I check the news in my favorite list$")
    public void i_check_the_news_in_my_favorite_list() {
        DashboardPage.goToFavorites();
        DashboardPage.checkNewsInDisplayed();
    }
    @Then("^I remove first news from favorite list$")
    public void i_remove_first_news_from_favorite_list() {
        DashboardPage.removeNewsFromTheFavoriteList(1);
    }
    @Then("^I check the removed news is not displayed$")
    public void i_check_the_removed_news_is_not_displayed() {
        DashboardPage.checkNewsNotDisplayed();
    }

    @Then("^I save numbers of the news$")
    public void i_save_numbers_of_the_news()  {
        DashboardPage.saveNumbersOfNews();
    }
    @Then("^I logout$")
    public void i_logout() {
       DashboardPage.logout();
    }

    @Then("^I login by another user$")
    public void i_login_by_another_user() {
        LoginPage.signIn("test13@test.com","123456");
        DashboardPage.checkUserNameAtDashboard("testuser");
    }

    @Then("^I check news from first loginned user$")
    public void i_check_news_from_first_loginned_user()  {
        DashboardPage.checkNumbersOfNewsAtAnotherUsersList();
    }
    @Then("^I go to bulk menu on my list news$")
    public void i_go_to_bulk_menu_on_my_list_news() {
        DashboardPage.goToMyList();
        DashboardPage.openBulkMenu();
    }
    @Then("^I select the from (\\d+) to (\\d+) and add to favorite$")
    public void i_select_the_from_to_and_add_to_favorite(int arg1, int arg2){
        DashboardPage.multiSelectNewsFromTo(arg1,arg2);
        DashboardPage.multiAddToFavorite();
    }
    @Then("^I save numbers of news in favorites$")
    public void i_save_numbers_of_news_in_favorites()  {
        DashboardPage.goToFavorites();
        DashboardPage.saveNumbersOfNews();
    }
    @Then("^I check the list of favorites$")
    public void i_check_the_list_of_favorites() {
        DashboardPage.goToFavorites();
        DashboardPage.checkNumberOfNewsGreaterThanActual();
    }
    @Then("^I open bulk menu$")
    public void i_open_bulk_menu()  {
        DashboardPage.openBulkMenu();
    }
    @Then("^I check number of news in favorites$")
    public void i_check_number_of_news_in_favorites() {
        DashboardPage.goToFavorites();
        DashboardPage.checkNumberOfNewsIsLessThanActual();
    }
    @Then("^I arhive news nr (\\d+) from my list$")
    public void i_arhive_news_nr_from_my_list(int arg1) {
        DashboardPage.addNewsTo(DashboardPage.archiveBtn,arg1);
    }
    @Then("^I check it in my list$")
    public void i_check_it_in_my_list() {
        DashboardPage.checkNewsNotDisplayed();
    }
    @Then("^I check it in arhive list$")
    public void i_check_it_in_arhive_list() {
        DashboardPage.goToArchive();
        DashboardPage.checkNewsInDisplayed();
    }

    @Then("^I remove first news from archive list$")
    public void i_remove_first_news_from_archive_list() {
        DashboardPage.goToArchive();
        DashboardPage.removeTheFirstNewsFromArchive(2);
    }
    @Then("^I save numbers of news in archive$")
    public void i_save_numbers_of_news_in_archive() {
        DashboardPage.goToArchive();
        DashboardPage.saveNumbersOfNews();

    }

    @Then("^I select the from (\\d+) to (\\d+) and add to archive$")
    public void i_select_the_from_to_and_add_to_archive(int arg1, int arg2) {
         DashboardPage.multiSelectNewsFromTo(arg1,arg2);
         DashboardPage.multiAddToArchive();
    }
    @Then("^I check the list of archives$")
    public void i_check_the_list_of_archives() {
        DashboardPage.goToArchive();
        DashboardPage.checkNumberOfNewsGreaterThanActual();
    }
    @Then("^I check number of news in archives$")
    public void i_check_number_of_news_in_archives(){
        DashboardPage.goToArchive();
        DashboardPage.checkNumberOfNewsIsLessThanActual();
    }


}