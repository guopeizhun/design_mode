package com.letg.design_mode.behavior.command;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:43
 * @Description:
 */


public class UpdateCommand implements Command {
    private Db db;

    public UpdateCommand(Db db) {
        this.db = db;
    }

    @Override
    public void exec() {
        db.update();
    }
}
