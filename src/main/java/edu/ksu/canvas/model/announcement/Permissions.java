package edu.ksu.canvas.model.announcement;

public class Permissions {
    private boolean attach;
    private boolean update;
    private boolean reply;
    private boolean delete;

	public boolean isAttach() {
		return attach;
	}

	public Permissions setAttach(boolean attach) {
		this.attach = attach;
		return this;
	}

	public boolean isUpdate() {
		return update;
	}

	public Permissions setUpdate(boolean update) {
		this.update = update;
		return this;
	}

	public boolean isReply() {
		return reply;
	}

	public Permissions setReply(boolean reply) {
		this.reply = reply;
		return this;
	}

	public boolean isDelete() {
		return delete;
	}

	public Permissions setDelete(boolean delete) {
		this.delete = delete;
		return this;
	}
}
