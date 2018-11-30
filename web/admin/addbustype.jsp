<style>
    .addbus{
        height: 100%;
        max-width: 400px;
        margin: auto;
    }
    input,button.login{
        background: #f9f9f9;
        padding: 5px 0;
        margin-top: 30px;
        width: 100%;
        box-sizing: border-box;
        box-shadow: none;
        outline: none;
        border: none;
        border-radius: 5px;
        border: 2px #0062cc solid;
        font-weight: bold;
        font-size: 14px;
    }
    input:focus,
    input:valid{
        border: 1px #0062cc solid;
        padding: 10px;
        font-size: 16px;
    }
    button.login{
        border-bottom: none;
        cursor: pointer;
        background: #0062cc;
        color: #fff;
        margin-bottom: 0px;
        text-transform: uppercase;
    }
    form div{
        position: relative;
    }
    form div label{
        position: absolute;
        top: 38px;
        left: 25px;
        color: #999;
        transition: 0.25s;
        pointer-events: none;
    }
    input:focus ~ label,
    input:valid ~ label{
        top: 10px;
        left: 25px;
        color: #0062cc;
        font-size: 16px;
        font-weight: bold;
    }
</style>
<div class="row">
    <div class="col-sm-12">
        <div class="addbus">
            <form method="POST" action="AddBusType">
                <div>
                    <input type="text" name="btype" required>
                    <label><span class="glyphicon glyphicon-scale"></span> Type</label>
                </div>
                <div class="errmsg"></div>
                <div>
                    <button class="login"><span class="glyphicon glyphicon-plus-sign"></span> Add Bus Type</button>
                </div>
            </form>
        </div>
</div>
</div>