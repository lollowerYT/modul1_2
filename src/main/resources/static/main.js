window.onload = function() {
    $(".like").click(function(e) {
        var btn = $(e.currentTarget);
        var postId = btn.attr("data-post-id");
        btn.attr("disabled", "disabled");

        $.post("/post/" + postId + "/like", function(data) {
            btn.text(data + " ❤");
            btn.removeClass("btn-secondary");
            btn.addClass("btn-danger");
        });
    });
};
