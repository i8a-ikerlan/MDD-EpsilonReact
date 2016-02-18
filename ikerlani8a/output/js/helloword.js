    /*** @jsx React.DOM */

var HELLOWORLD = React.createClass({
    render:function(){
        return (
                React.DOM.h1({
						style: {
							background: "red",
							color: "white",
							fontFamily: "Calibri"
						}
					},
					"Hello World")
            	)
    }
});


React.render(
	React.createElement(HELLOWORLD),
	document.getElementById("divHW")
);